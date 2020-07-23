package practice11;

/**
 * @Author ZHUDO2
 * @Date 7/23/2020 3:01 PM
 * @Version 1.0
 */
public interface TeacherObserver {
    void printGetJoinMessage(Student student ,Klass klass);
    void printGetSetLeaderMessage(Student student,Klass klass);
}
