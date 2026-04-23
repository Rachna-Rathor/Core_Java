class Main{
 // creating class for burger
    public static class burger {
        int price;   
        String chiz;
        public void burgerType(String chiz){
               this.chiz=chiz;
        }
        public void display(){
        System.out.println("double chiz burger");
        }  
    }
    public static void main(String args[]){
        burger b=new burger();
        b.price=90;
        b.burgerType("double chiz burger");
        b.display();
     
    }
}