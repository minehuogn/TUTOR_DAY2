package Model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Animals{" + "Id=" + Id + ", Name=" + Name + ", Weight=" + Weight + ", Type=" + Type + ", Gender=" + Gender + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animals other = (Animals) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (Float.floatToIntBits(this.Weight) != Float.floatToIntBits(other.Weight)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Type, other.Type)) {
            return false;
        }
        return Objects.equals(this.Gender, other.Gender);
    }
    

    
}
