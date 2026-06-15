public class day8 {
    /*
     record courserecord(String dept,String name){

     }
static void main(){
         courserecord courserecord = new courserecord("ai","bsc cs");
         System.out.println(courserecord.dept());
         System.out.println(courserecord.name());
     }
}

     */
   enum language {
       EN ("English"),
       GR ("German"),
       JP ("japanese"),
       TA ("Tamil");

       String description;
       language(String description){
           this.description = description;

       }
   }

   static void main(){
   System.out.println("......language......");
   System.out.println(language.EN.description);
   System.out.println(language.GR.description);
   System.out.println(language.JP.description);
   System.out.println(language.TA.description);
   }
}
