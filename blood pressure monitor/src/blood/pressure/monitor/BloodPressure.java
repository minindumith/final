/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.pressure.monitor;

import static blood.pressure.monitor.Tester.bloodPressure;
import java.time.Year;

public class BloodPressure {

    int id;
    String name;
    String yob;
    int systolic;
    int diastolic;
    double bloodPressure;
    String category;
    int age;
    String range;

    public BloodPressure(int id, String name, String yob, int systolic, int diastolic) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public double getBloodpressure() {
        return bloodPressure;
    }

    public String getCategory() {
        return category;
    }

    public int getAge() {
        return age;
    }

    

    public String getRange() {
        return range;
    }
    
    

    public void calculate() {
        bloodPressure = systolic / diastolic;
        age = Year.now().getValue()   - Integer.parseInt(yob);
    }

    public void display() {
        
        if(systolic==120 && diastolic==80){
        category="normal";
        }else if(systolic>=120 || systolic<=129 && diastolic<=80 || diastolic<=89){
            category="elevated";
        }else if(systolic>=130 || systolic<=139 && diastolic<=80 || diastolic<=89){
            category="Hypertenstion stage 1";
        }else if(systolic==120 && diastolic==80){
            category="hypertension stage 2";
        }else if(systolic>=120  && diastolic>=90){
            category="hypertensive crisis";
        }
        
        if(age==1){
        if(systolic==75 && diastolic==50){
            range = "min";
         
            }else if(systolic==90 && diastolic==60){
             range = "normal";
            }else if(systolic==100 && diastolic==75){
             range = "max";
            }
        }else if(age>1 || age<=5){
            
            if(systolic==80 && diastolic==55){
             range = "min";
            }else if(systolic==95 && diastolic==65){
             range = "normal";
            }else if(systolic==110 && diastolic==79){
            range = "max";
            }
        
        }else if(age>=6 || age<=13){
            
            if(systolic==90 && diastolic==60){
             range = "min";
            }else if(systolic==105 && diastolic==70){
             range = "normal";
            }else if(systolic==115 && diastolic==80){
            range = "max";
            }
        
        }else if(age>=14 || age<=19){
            
            if(systolic==105 && diastolic==73){
             range = "min";
            }else if(systolic==117 && diastolic==77){
             range = "normal";
            }else if(systolic==120 && diastolic==81){
            range = "max";
            }
        
        }else if(age>=20 || age<=24){
            
            if(systolic==108 && diastolic==75){
             range = "min";
            }else if(systolic==120 && diastolic==79){
             range = "normal";
            }else if(systolic==132 && diastolic==83){
            range = "max";
            }
        
        }else if(age>=25 || age<=29){
            
            if(systolic==109 && diastolic==76){
             range = "min";
            }else if(systolic==121 && diastolic==80){
             range = "normal";
            }else if(systolic==133 && diastolic==84){
            range = "max";
            }
        
        }else if(age>=30 || age<=34){
            
            if(systolic==110 && diastolic==77){
             range = "min";
            }else if(systolic==122 && diastolic==81){
             range = "normal";
            }else if(systolic==134 && diastolic==85){
            range = "max";
            }
        
        }else if(age>=35 || age<=39){
            
            if(systolic==111 && diastolic==78){
             range = "min";
            }else if(systolic==123 && diastolic==82){
             range = "normal";
            }else if(systolic==135 && diastolic==86){
            range = "max";
            }
        
        }else if(age>=40 || age<=44){
            
            if(systolic==112 && diastolic==79){
             range = "min";
            }else if(systolic==125 && diastolic==83){
             range = "normal";
            }else if(systolic==137 && diastolic==87){
            range = "max";
            }
        
        }else if(age>=45 || age<=49){
            
            if(systolic==115 && diastolic==80){
             range = "min";
            }else if(systolic==127 && diastolic==84){
             range = "normal";
            }else if(systolic==139 && diastolic==88){
            range = "max";
            }
        
        }else if(age>=50 || age<=54){
            
            if(systolic==116 && diastolic==81){
             range = "min";
            }else if(systolic==129 && diastolic==85){
             range = "normal";
            }else if(systolic==142 && diastolic==89){
            range = "max";
            }
        
        }else if(age>=55 || age<=59){
            
            if(systolic==118 && diastolic==82){
             range = "min";
            }else if(systolic==131 && diastolic==86){
             range = "normal";
            }else if(systolic==144 && diastolic==90){
            range = "max";
            }
        
        }else if(age>=60 || age<=64){
            
            if(systolic==121 && diastolic==83){
             range = "min";
            }else if(systolic==134 && diastolic==87){
             range = "normal";
            }else if(systolic==147 && diastolic==91){
            range = "max";
            }
        
        }
    }

}
