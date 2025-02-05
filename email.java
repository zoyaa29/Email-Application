import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    String email;
    private int defaultpassword=10;
    private int mailboxcapacity=500;
    String companySuffix="TCSCompany.com";
    private String alternateEmail;

    //constructor to recieve first and last name
    public email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        
        this.department=setdepartment();
       
        // call a method for random pass

        this.password=randompassword(defaultpassword);
        System.out.println("Your password is :"+ this.password);

        //combine all elements to generate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your email is:"+ email);


       

    }


    //ask for the department
    private String  setdepartment(){
        System.out.print(" New Employee :" + firstName+ ":"+" department Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the Department Code:");
        Scanner sc=new Scanner(System.in);
        int deptchoice=sc.nextInt();
        if(deptchoice==1){
            return "Sales";
        }
        else if(deptchoice==2){
            return "Development";
        }
        else if(deptchoice==3){
            return "Accounting";
        }
        else{
            return "None";
        }
        
    }
    //generate a rendom pass

    private String randompassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
            
        }
        return new String(password);
    }



    
   



    //set the mailboxcapacity
    public void setMailboxCapacity(int capacity){
        this.mailboxcapacity=capacity;
    }


    //set the alternate mail

    public void setAlternateEmail(String AltEmail){
        this.alternateEmail=AltEmail;
    }




    //change the password

    public void changepassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity(){
        return mailboxcapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getpassword(){
        return password;
    }
    public String showInfo(){
        return "Display Name :"+ firstName + " " + lastName+
        "\n Company Email :"+ email+
        "\n MailBoxCapacity :"+ mailboxcapacity+"mb";


    }

}
