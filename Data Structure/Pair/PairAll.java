// Or we can also use pair DS for using pair class
class Pair{
  int a;
  int b;
  void Pair(int a, int b){
      this.a=a;
      this.b=b;
  }
}
public class myClass{
  public static void main(String[] args){
      List<Pair> list = new ArrayList<>();
    list.add(new Pair(5, 10));
    
  }
}

//-->Pair is class in java. with the help of this we can add a pair 
Pair<String, Integer> p = new Pair<String, Integer>("Atul", 123);

--> // we u want to access key or value in pair then use 
p.getKey();
p.getValue();

//--> we want to add mulitple pair then you can use 
List<Pair<Integer, String>> pairList = new ArrayList<>();
pairList.add(new Pair<String,Integer> ("atul",1));
pairList.add(new Pair<String,Integer> ("ujjwal",2));
pairList.add(new Pair<String,Integer> ("shayla",3));
pairList.add(new Pair<String,Integer> ("utsav",5));

-->
