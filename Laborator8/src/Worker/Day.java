package Worker;

public class Day {
    private String name;
    boolean working;

    /**
     * Returns the
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is a setter.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Is working or not
     * @return working
     */
    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setWorking1() {
        this.working = true;
    }

    public void setNotWorking() {
        this.working = false;
    }

    public Day(String name, boolean working)
    {
        this.name = name;
        this.working = working;
    }
}
