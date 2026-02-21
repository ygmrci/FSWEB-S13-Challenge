package org.example;
import org.example.enums.Plan;


public class Healthplan {

    private long id;
    private  String name;
    private  Plan plan;

    ////Healthplan'nin constructor'ı
    public Healthplan(long id, String name, Plan plan){
        this.name= name;
        this.id = id;
        this.plan= plan;
    }
    public long getId(){
        return id;
    }
    public void  setId(long id){
        this.id = id;
    }
    public String getName(){

        return name;
    }
    public void  setName(String name){

        this.name = name;
    }
    public Plan getPlan(){

        return plan;
    }
    public  void setPlan(Plan plan){

        this.plan =plan;
    }

    public String toString(){
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }

}
