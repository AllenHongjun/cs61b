public class Dog {

    /**
     * 1. 看40分钟的视频
     * 2. 看40分钟的ppt
     * 3. 敲40分钟的代码
     * 4. 做40分钟的作业
     * 4. 做40分钟的实验
     * 5. 做40分钟的项目
     * 5. 看40分钟的书籍
     * 5. 查40分钟的资料
     * 6. 解决一些疑惑和问题
     */

     private int size;

     public Dog(int s){
         size = s;
     }

     public  String noise(){

         if(size < 10){
             return "yip";
         }

         return "bark";
     }

}
