class TimeDemo {
    int hours, minutes, seconds;

    TimeDemo(int seconds) {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = seconds;
    }

    TimeDemo(int minutes, int seconds) {
        this.hours = 0;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    TimeDemo(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() {
        System.out.println(hours + " hours, "
                + minutes + " minutes, "
                + seconds + " seconds");
    }

    public static void main(String[] args) {
        TimeDemo t1 = new TimeDemo(45);
        TimeDemo t2 = new TimeDemo(5, 30);
        TimeDemo t3 = new TimeDemo(2, 15, 40);

        t1.display();
        t2.display();
        t3.display();
    }
}