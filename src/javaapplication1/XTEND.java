
package javaapplication1;


public class XTEND {
    

    public XTEND(){}
    Integer num1=0,num2=0,mcd=0,op=0,num3=0;
    Integer b2=0,ac=0,a2=0,b=0,res=0,res2=0,res3=0;
    public void setigual(int x,int y){
        this.num1=x;
        this.num2=y;
    if(num1==num2){
        
      System.out.println("LOS NUMEROS SON IGUALES");
    }else{
    System.out.println("LOS NUMEROS NO SON IGUALWA");
    
    }
    
    
    }
    public void setmayorcin(int x,int y){
    this.num1=x;
    this.num2=y;
    
    if(num1>num2){
    System.out.println("EL "+num1+"es Mayor que "+num2+".");
    
    }else{
    
    System.out.println("EL "+num2+"es Mayor que "+num1+".");
    }
  }
     public void setmenor(int x,int y){
    this.num1=x;
    this.num2=y;
    
    if(num1<num2){
    System.out.println("EL "+num1+"es menor que "+num2+".");
    
    }else{
    
    System.out.println("EL "+num2+"es menor que "+num1+".");
    }
     }
     public void macimo(int x,int y){///cvhfghfghfghfghfghEN PROCESO
    this.num1=x;
    this.num2=y;

    do{
    num2=num1%num2;
    num2=mcd;
    }while(num2!=0);
  
  System.out.println("EL MCD es "+mcd+".");  }
     
     public void setmulti(int x,int y){
    this.num1=x;
    this.num2=y;
   op=num1*num2;
    System.out.println("EL PRODUCTO DE " +num1+ " * " +num2+ " es "+op);
    
   op=0;
  }
       public void setdivision(int x,int y){
    this.num1=x;
    this.num2=y;
   op=num1/num2;
    System.out.println("LA DIVISION DE " +num1+ " / " +num2+ " es "+op);
    op=0;
   
  }
         public void setresta(int x,int y){
    this.num1=x;
    this.num2=y;
   op=num1-num2;
    System.out.println("LA RESTA DE " +num1+ " - " +num2+ " es "+op);
    op=0;
   
  } 
         
         
                public void raiz(int x){
    this.num1=x;
   double resul =Math.sqrt(num1);

    System.out.println("LA RAIZ ES"+resul);
  
   
  } 
          public void setcuadratica(int x,int y,int z){
    this.num1=x;
    this.num2=y;
    this.num3=z;
   b2=num2*num2;
   ac=4*(num1*num3);
   
   
    System.out.println("LA RESTA DE " +num1+ " - " +num2+ " es "+op);
    op=0;
   
  } 
     
     
     
     
 }




    

