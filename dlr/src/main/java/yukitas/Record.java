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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getTask1() {
        return task1;
    }

    public void setTask1(Boolean task1) {
        this.task1 = task1;
    }

    public Boolean getTask2() {
        return task2;
    }

    public void setTask2(Boolean task2) {
        this.task2 = task2;
    }

    public Boolean getTask3() {
        return task3;
    }

    public void setTask3(Boolean task3) {
        this.task3 = task3;
    }

    public Boolean getTask4() {
        return task4;
    }

    public void setTask4(Boolean task4) {
        this.task4 = task4;
    }

    public Boolean getTask5() {
        return task5;
    }

    public void setTask5(Boolean task5) {
        this.task5 = task5;
    }

    @Override
    public String toString() {
        return String.format("Record[id='%s', date='%s', task1=%b, task2=%b, task3=%b, task4=%b, task5=%b]", id, date, task1, task2, task3,
                task4, task5);
    }
}
