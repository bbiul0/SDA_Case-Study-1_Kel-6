package students;

import honorroll.Observer;

public class Notifier implements Observer {
    @Override
    public void notifyHonorRoll(Student student) {
        System.out.println("Congratulations! student " + student.getName() + " has been granted the Honor Roll title!");
    }
}