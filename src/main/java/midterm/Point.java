package midterm;

public class Point {
    private Integer value;
    private String index;

    public Point(Integer value, String index){
        this.value = value;
        this.index = index;
    }
    public String getIndex(){
        return index;
    }
    public Integer getValue(){
        return value;
    }
}
