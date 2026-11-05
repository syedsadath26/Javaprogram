class InternetPlan {
    String planName;
    int data;
    double price;

    InternetPlan() {
        this("Basic", 2, 199);
    }

    InternetPlan(String planName, int data) {
        this(planName, data, 299);
    }

    InternetPlan(String planName, int data, double price) {
        this.planName = planName;
        this.data = data;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName);
        System.out.println("Data: " + data + " GB/day");
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Standard", 3);
        InternetPlan p3 = new InternetPlan("Premium", 5, 499);

        p1.display();
        p2.display();
        p3.display();
    }
}