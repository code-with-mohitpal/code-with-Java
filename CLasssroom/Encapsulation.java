
class User{
    private int userId;
    private String password;
    private String email;

    //getter : to get or retrieve the value of respective data member
    // and its return type must be same as the data member type

    //setter : to set or assign the value of respectivr data member
    // and its return type is void and parameterized

    //syntax :
    //getter : starts with getVariableName
    //setter : starts with setVariableName

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public int getUserId()
    {
        return this.userId;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    //constructor
    public User()
    {

    }

    public User(int userId, String password, String email)
    {
        this.userId = userId;
        this.password = password;
        this.email = email;

        System.out.println(this.userId+" "+this.email+" "+this.password);
    }

}

class Encapsulation{
    public static void main(String args[])
    {
        User user1 = new User();
        
        //getter and setter
        user1.setUserId(345);
        user1.setEmail("raj20@gmail.com");
        user1.setPassword("raj@123");

        System.out.println("User ID : "+user1.getUserId());
        System.out.println("User Email : "+user1.getEmail());
        System.out.println("User Password : "+user1.getPassword());

        //constructor
        User user2 = new User(456, "aman@123", "aman@gmail.com");
        
        //getter setter vs constructor
        //when there is need of setting or getting specific value
        // then go with getter setter

        //when there is need of assigning all the value at once
        // then go with construcor
        
    }
}