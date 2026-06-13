public class day8 {
     record courserecord(String dept,String name){

     }
static void main(){
         courserecord courserecord = new courserecord("ai","bsc cs");
         System.out.println(courserecord.dept());
         System.out.println(courserecord.name());
     }
}