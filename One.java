public class One {
    private int limit;
    private int max_people;

    public One() {
        this.limit = 0;
        this.max_people = 0;
    }

    public void setLimit(int maximum) {
        max_people = maximum;
        System.out.println("For this event are allow " + max_people + " people");
    }

    public void next() {
        limit = limit + 1;

        if (limit == max_people) {
            System.out.println("Limit exceeded");
            System.out.println("I'm going to reset the people");
            limit = 0;
        } else {
            System.out.println("Add a person");
            System.out.println("So far we have " + limit + " people");
        }
    }
}