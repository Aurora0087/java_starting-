package com.oop.Dynamic_Method_Dispatch;

class super_cl{
    public void sup_name(){
        System.out.println("IT'S FROM SUPER CLASS......");
    }
    public void idk(double a){
        System.out.println("IT'S FROM SUPER CLASS. Given value = "+a+" .");
    }
}
class sub_cl extends super_cl{
    public void sub_name(){
        System.out.println("IT'S FROM SUB CLASS......");
    }
    @Override
    public void idk(double a){
        System.out.println("IT'S FROM SUB CLASS. Given value = "+a+" .");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        super_cl a1=new sub_cl();   // --> object created as subclass  but refers as super class
        //sub_cl a2=new super_cl(); --> error
        a1.sup_name();
        //a1.sub_name(); -> error, because its not available in reference class
        a1.idk(23);
    }
}
