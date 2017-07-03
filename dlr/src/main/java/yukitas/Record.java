package yukitas;

import org.springframework.data.annotation.Id;

public class Record {
    @Id
    public String id;

    public String date;
    public Boolean task1;
    public Boolean task2;
    public Boolean task3;
    public Boolean task4;
    public Boolean task5;

    public Record() {
    }

    public Record(String date, Boolean task1, Boolean task2, Boolean task3, Boolean task4, Boolean task5) {
        this.date = date;
        this.task1 = task1;
        this.task2 = task2;
        this.task3 = task3;
        this.task4 = task4;
        this.task5 = task5;
    }

    @Override
    public String toString() {
        return String.format("Record[id=%s, date='%s', task1=%b, task2=%b, task3=%b, task4=%b, task5=%b]", id, date, task1, task2,
                task3, task4, task5);
    }
}
