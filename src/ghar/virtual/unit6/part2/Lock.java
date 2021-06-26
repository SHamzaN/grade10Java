package ghar.javawork.virtual.unit6.part2;

public class Lock {
    protected boolean locked;

    public Lock(){
      locked = true;
    }
    public void open(){
        locked = false;
    }
    public void close(){
        locked = true;
    }
    public boolean amILocked(){
        return locked;
    }
    @Override
    public String toString(){
        if (amILocked() == false)
            return "Lock is open";
        else
            return "Lock is closed";
    }
}
