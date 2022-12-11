--> //if you want to add the element in  list or arraylist in a single line then
  List<Integer> list = Arrays.asList(1,21,3,4,5,);    // no need to write list.add(1), list.add(2)
--> // if we want to the element from the 2D list then we can write code like this
  public static void main(String[] args) {
		List<List<Integer>> l = new ArrayList<>();
		l.add(Arrays.asList(1,2,3));
		l.add(Arrays.asList(4,5,6));
		l.add(Arrays.asList(7,8,9));
		
		System.out.println(l.get(0).get(2)); // this is most important
	}
