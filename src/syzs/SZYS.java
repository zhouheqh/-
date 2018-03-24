package syzs;

public class SZYS {
    String f()
      {
          int i=(int)(Math.random()*10);//生成1-10的数
          int j=(int)(Math.random()*10);
          if(i>=j)
          {
             int temp=i;
             i=j;
             j=temp;
         }
         return("("+i+"/"+j+")");
     }
    public static void opt(String s) throws Exception{
        if(s == null || "".equals(s.trim())) {
            return;
        }
    }
     public static void main(String[] args)
     {
         String x,y;
         int z;
         SZYS A=new SZYS();
         System.out.println("201571030337");
         for(int n=0;n<100;n++)
         {
             x=A.f();
             y=A.f();
             int i=(int)(Math.random()*100);//生成1-100的数
             int j=(int)(Math.random()*100);
             switch((int)(Math.random()*4))
             {
             case 0:
               z=(int)(Math.random()*3);
                 if(z==0)
                    System.out.println(i+"+"+j+"=");
                 else if(z==1)
                    System.out.println(x+"+"+j+"=");
                 else if(z==2)
                       System.out.println(y+"+"+x+"=");
                 break;
             case 1:
                 z=(int)(Math.random()*3);
                 if(i<j)
                 {
                     int temp=i;
                     i=j;
                     j=temp;
                }
                     if(z==0)
                         System.out.println(i+"-"+j+"=");
                     else if(z==1)
                         System.out.println(j+"-"+x+"=");
                     else if(z==2)
                         System.out.println(y+"-"+x+"=");
               break;
             case 2:
                 z=(int)(Math.random()*3);
                    if(z==0)
                        System.out.println(i+"*"+j+"=");
                     else if(z==1)
                        System.out.println(x+"*"+j+"=");
                     else if(z==2)
                            System.out.println(y+"*"+x+"=");
               break;
             case 3:
             while(j==0)
               j= (int)(Math.random()*100);
               System.out.println(i+"/"+j+"=");
               break;
               }
         }
    }
 }