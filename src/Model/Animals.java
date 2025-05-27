package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minehuogn
 */
public class Animals {
    public int Id;
    public String Name;
    public float Weight;
    public String Type;
    public String Gender;

    public Animals(int Id, String Name, float Weight, String Type, String Gender) {
        this.Id = Id;
        this.Name = Name;
        this.Weight = Weight;
        this.Type = Type;
        this.Gender = Gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getGender() {
        return Gender;
    }

    
}
