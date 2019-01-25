package goals;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class FileWriting {
    
    private static String user = ""; 
    public static void create(String username, String password, String name, String age, String location, String goal) throws FileNotFoundException, IOException{
        
        user = username; // Gets username
        File file = new File(username.toUpperCase()+".txt"); // Creates user file
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        
        String pass = password; // Gets user info
        String info = name+"#"+age+"#"+location+"#"+goal;
        info = encryption(info); // Encrypts user info
        pass = encryption(pass);
        writer.println(pass); // Writes it to file
        writer.println(info);
        writer.close();     
    }
    
    public static String encryption(String s){ // Encryption method
        
        String n = "";
        for(int i = 0; i < s.length(); i++){
            
            char a = s.charAt(i);
            int ascii = (int) a; 
            ascii += 1;  // Ascii value of each char is increased by 1 
            n += (char) ascii;

        }
        return n;
    }

    public static String decryption(String s){ // Decryption method
         
        String n = "";
        for(int i = 0; i < s.length(); i++){
            
            char a = s.charAt(i);
            int ascii = (int) a;
            ascii -= 1; // Ascii value of each char is decreased by 1 
            n += (char) ascii;

        }
        return n;
    }
    
    public static void setUser(String u){
        
        user = u; // Sets current user
    }
    
    public static void addGoal(String g) throws IOException{
        
        FileWriter fw = new FileWriter(user.toUpperCase()+".txt",true);
        PrintWriter output = new PrintWriter(fw);
        output.append(g); // Adds goal to file
        
        output.close();
        fw.close();
        
    }
    
    public static void view() throws FileNotFoundException, IOException{
        
        LinkedList<String>list = getGoals(); // List of goals in txt file
        
        String [][] goals = new String[list.size()][6];
        String [] goals3 = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            
            String line = list.get(i);
            line = decryption(line); // Decrypts info
            String [] goals2 = line.split("#");
            goals3[i] = goals2[0];
            for(int j = 0; j < 6; j++){
                
                goals[i][j] = goals2[j]; // Gets names of all the goals
            }            
            
        }
         
       String goal = (String) JOptionPane.showInputDialog(null,  // Asks user to select  goal
                            "Select a goal to view it",
                            "View Goals",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            goals3,
                            goals3[0]); 
       
       for(int i = 0; i < list.size(); i++){
           
           if(goals[i][0].equals(goal)){ // Prints out selected goal
               
               JOptionPane.showMessageDialog(null, "Goal Name: "+goals[i][0]+"\nGoal Catagory: "+goals[i][1]+"\nGoal Type: "+goals[i][2]+"\nStart Date: "+goals[i][3]+"\nEnd Date: "+goals[i][4]+"\nAdditional Information: "+goals[i][5]);
               
           }
       }
   
    }
    
    public static void update() throws IOException{
        
        
        LinkedList<String> list = getGoals();
        String [][] goals = new String[list.size()][6];
        String [] goals3 = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            
            String line = list.get(i);
            line = decryption(line);
            String [] goals2 = line.split("#");
            goals3[i] = goals2[0];
            for(int j = 0; j < 6; j++){
                
                goals[i][j] = goals2[j];
            }            
            
        }
         
        String goal = (String) JOptionPane.showInputDialog(null, 
                            "Select a goal to update it",
                            "Update Goals",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            goals3,
                            goals3[0]); 
    
    
        String [] options = {"Name", "Catagory", "Type", "Start Date", "End Date", "Additional Information"};

        String choice = (String) JOptionPane.showInputDialog(null, // Gives user option of what they want to update
                                "What would you like to update",
                                "Update Goals",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                options,
                                options[0]); 
        
        for(int i = 0; i < list.size(); i++){
            
            if(goals[i][0].equals(goal)){ // Updates info accordingly
                
                if(choice.equals("Name")) { // User types new name
                                        
                    goals[i][0] = (String) JOptionPane.showInputDialog(null, "Enter new name", "Update", JOptionPane.YES_NO_CANCEL_OPTION);
                    
                }
                if(choice.equals("Category")) {
                                       
                    goals[i][1] = (String) JOptionPane.showInputDialog(null, "Enter new catagory", "Update", JOptionPane.YES_NO_CANCEL_OPTION);
                    
                }
                if(choice.equals("Type")){ // User selects Definitive or numerical
                    
                    String [] opts = {"Definitive", "Numerical"};
                    goals[i][2] = (String) JOptionPane.showInputDialog(null, 
                            "Select a new type ",
                            "Update",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opts, 
                            opts[0]);
                    
                }
                if(choice.equals("Start Date")){ 
                    
                    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
                    String s = (String) JOptionPane.showInputDialog(null, "Enter new start date (DD-MM-YYYY) ", "Update", JOptionPane.YES_NO_CANCEL_OPTION); // User enters new date
                    Date d = new Date();
                    Date today = new Date();
                    
                    boolean correct = true;
                    try {
                        d = ft.parse(s);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Date is not valid", "Error", WIDTH); // If it is not a real date  
                        correct = false;
                    }
                    if(d.before(today)){
           
                        JOptionPane.showMessageDialog(null, "Start date is not valid", "Error", WIDTH); // If it is before the current date
                        correct = false;
                    }
                    
                    
                    if(correct){
                        
                        
                        goals[i][3] = s; // If it is valid it is updated
                    }
                    
                }
                if(choice.equals("End Date")){
                    
                    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
                    String s = (String) JOptionPane.showInputDialog(null, "Enter new end date (DD-MM-YYYY) ", "Update", JOptionPane.YES_NO_CANCEL_OPTION);
                    Date d = new Date();
                    Date today = new Date();
                    
                    boolean correct = true;
                    try {
                        d = ft.parse(s);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Date is not valid", "Error", WIDTH);  
                        correct = false;
                    }
                    if(d.before(today)){
           
                        JOptionPane.showMessageDialog(null, "Date is not valid", "Error", WIDTH); 
                        correct = false;
                    }
                    
                    if(correct){
                        
                        
                        goals[i][4] = s;
                    }
                
                    
                }
            if(choice.equals("Additional Information")) { // User types new information
                                        
                    goals[i][5] = (String) JOptionPane.showInputDialog(null, "Enter new information", "Update", JOptionPane.YES_NO_CANCEL_OPTION);
                    
                }  
            }            
              
            
        }
        
        File file = new File("temp.txt"); // Temp txt file created
        File file2 = new File(user.toUpperCase()+".txt");
        BufferedReader br = new BufferedReader(new FileReader(file2));
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        
        for(int i = 0; i < 2; i++){ // First 2 lines are copied directly
            
            String line = br.readLine();
            writer.println(line);
            
        }
        br.close();
        
        for(int i = 0; i < list.size(); i++){ // Updated goals written to temp file
            
            writer.println(encryption(goals[i][0]+"#"+goals[i][1]+"#"+goals[i][2]+"#"+goals[i][3]+"#"+goals[i][4]+"#"+goals[i][5]));
        }
        writer.close();
        file2.delete(); // Temp file made into main file
        file.renameTo(file2);
        
 
    }
    
    public static void delete() throws IOException{
        
        LinkedList<String> list = getGoals();
        
        String [][] goals = new String[list.size()][6];
        String [] goals3 = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            
            String line = list.get(i);
            line = decryption(line);
            String [] goals2 = line.split("#");
            goals3[i] = goals2[0];
            for(int j = 0; j < 6; j++){
                
                goals[i][j] = goals2[j];
            }            
            
        }
         
        String goal = (String) JOptionPane.showInputDialog(null, // User selects goal to delete 
                            "Select a goal to delete it",
                            "Delete Goals",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            goals3,
                            goals3[0]); 
        
        File file = new File(user.toUpperCase()+".txt");
        File file2 = new File("temp.txt");
        PrintWriter writer = new PrintWriter(file2, "UTF-8");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        for(int i = 0; i < 2; i++){
            
            String line = br.readLine();
            writer.println(line);
            
        }
        br.close();
        for(int i = 0; i < list.size(); i++){
            
            if(!goals[i][0].equals(goal)){ // If it is not the desired goal then write to temp file
                
                writer.println(encryption(goals[i][0]+"#"+goals[i][1]+"#"+goals[i][2]+"#"+goals[i][3]+"#"+goals[i][4]+"#"+goals[i][5]));
                
            }
            
        }
        writer.close();
        file.delete();
        file2.renameTo(file);
        
        
        
    }
    
    
    public static LinkedList<String> getGoals() throws FileNotFoundException, IOException{
        LinkedList<String> list = new LinkedList<>();
        
        File file = new File(user.toUpperCase()+".txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine(); // Skips first 2 lines
        br.readLine();
        String line = "";
        while(line != null){ // Loops through file

            line = br.readLine();
            if(line != null){
            list.add(line);
            }
 
        }
        br.close();
        return list;
        
    }
}