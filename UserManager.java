package inheritancehomework;



public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+ " eklendi.");
    }

    public void addMultiple(User[] users){
        for (User user:users){
            add(user);
        }
    }

    public void changePassword(User user,String newPassword){
        System.out.println(user.getFirstName() + "�ifre de�i�ti");
    }

    public void login(User user){
        System.out.println(user.getFirstName() + " giri� yapt�");
    }

    public void logout(User user){
        System.out.println(user.getFirstName() + " ��k�� yapt�");
    }

    public void comment(User user,Course course,String message){
        System.out.println(course.getName() + "\n" + user.getFirstName() + ": " + message);
    }
}
