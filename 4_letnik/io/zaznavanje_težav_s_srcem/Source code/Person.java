import java.io.*;
import java.text.*;
import java.util.*;

public class Person {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private int heartRate;
    private float weight;
    private float height;
    private long date;

    public Person(String name, int age, int systolic, int diastolic, int heartRate, float weight, float height) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.heartRate = heartRate;
        this.weight = weight;
        this.height = height;
        date = System.currentTimeMillis();
    }

    public float calculateBMI() {
        return weight / (float) Math.pow(height, 2);
    }

    public Result checkBMI() {
        float bmi = calculateBMI();

        if (bmi < 18.5) return Result.worrying;
        if (bmi < 23) return Result.optimal;
        if (bmi < 25) return Result.ok;
        if (bmi < 30) return Result.worrying;
        return Result.critical;
    }

    public Result checkHeartRate() {
        if (heartRate < 35) return Result.critical;
        if (heartRate < 60) return Result.optimal;
        if (heartRate < 90) return Result.ok;
        if (heartRate < 100) return Result.worrying;
        return Result.critical;
    }

    public Result checkSystolic() {
        if (systolic > 140) return Result.critical;
        if (systolic > 120) return Result.worrying;
        if (systolic > 95) return Result.ok;
        if (systolic > 90) return Result.optimal;
        return Result.worrying;
    }

    public Result checkDiastolic() {
        if (diastolic > 90) return Result.critical;
        if (diastolic > 80) return Result.worrying;
        if (diastolic > 65) return Result.ok;
        if (diastolic > 60) return Result.optimal;
        return Result.worrying;
    }

    public Result heartHealth() {
        int sum = 0;
        sum += Person.calculatePoints(checkBMI());
        sum += Person.calculatePoints(checkHeartRate());
        sum += Person.calculatePoints(checkSystolic());
        sum += Person.calculatePoints(checkDiastolic());

        if (age > 55) {
            sum++;
        }

        if (sum < 2) return Result.optimal;
        if (sum < 4) return Result.ok;
        if (sum < 7) return Result.worrying;
        return Result.critical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        date = System.currentTimeMillis();
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        date = System.currentTimeMillis();
        this.age = age;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        date = System.currentTimeMillis();
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        date = System.currentTimeMillis();
        this.diastolic = diastolic;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        date = System.currentTimeMillis();
        this.heartRate = heartRate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        date = System.currentTimeMillis();
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        date = System.currentTimeMillis();
        this.height = height;
    }

    public long getDate() {
        return date;
    }

    public String getDateString() {
        DateFormat dateFormat = new SimpleDateFormat("dd. MM. yyyy - HH:mm:ss");
        Date date = new Date(getDate());
        return dateFormat.format(date);
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n");
        sb.append("    Date: " + getDateString() + "\n\n");
        sb.append("    Age: " + age + " years\n");
        sb.append("    Body mass index: " + calculateBMI() + " kg/m2\n");
        sb.append("    Systolic pressure: " + systolic + " mmHg\n");
        sb.append("    Diastolic pressure: " + diastolic + " mmHg\n");
        sb.append("    Heart rate: " + heartRate + " beats/minute\n");
        sb.append("    Weight: " + weight + " kg\n");
        sb.append("    Height: " + height + " m\n\n");

        sb.append("    Heart health: " + heartHealth() + "\n");
        sb.append("      Body mass index: " + checkBMI() + "\n");
        sb.append("      Heart rate: " + checkHeartRate() + "\n");
        sb.append("      Systolic pressure: " + checkSystolic() + "\n");
        sb.append("      Diastolic pressure: " + checkDiastolic() + "\n");

        return sb.toString();
    }

    public static void save(String filename, Person p) throws IOException {
        if (!filename.endsWith(".dat")) filename += ".dat";

        RandomAccessFile rad = new RandomAccessFile(filename, "rw");
        // Ends with new line so we know, where the string ends in binary file
        rad.writeBytes(p.getName() + "\n");
        rad.writeInt(p.getAge());
        rad.writeInt(p.getSystolic());
        rad.writeInt(p.getDiastolic());
        rad.writeInt(p.getHeartRate());
        rad.writeFloat(p.getWeight());
        rad.writeFloat(p.getHeight());
        rad.writeLong(p.getDate());

        rad.close();
    }

    public static void saveReadable(String filename, Person p) throws IOException {
        if (!filename.endsWith(".txt")) filename += ".txt";

        PrintWriter writer = new PrintWriter(new File(filename));
        writer.write(p.toString());
        writer.close();
        ;
    }

    public static Person load(String filename) throws IOException {
        if (!filename.endsWith(".dat")) filename += ".dat";

        RandomAccessFile rad = new RandomAccessFile(filename, "r");
        Person p = new Person(rad.readLine(), rad.readInt(), rad.readInt(), rad.readInt(), rad.readInt(),
                rad.readFloat(), rad.readFloat());

        p.setDate(rad.readLong());

        rad.close();
        return p;
    }

    public static int calculatePoints(Result r) {
        switch (r) {
            case optimal:
                return 0;
            case ok:
                return 1;
            case worrying:
                return 2;
        }
        return 4;
    }
}
