//-----------------------------------------------------StringBuilder-------------------------------------------------
String s = "Atul Kumar";
StringBuilder sb = new StringBuilder(s);
sb.charAt(0);  //output = A
sb.length();  //output:- 10
sb.append(" saini");  //output:- Atul Kumar Saini
sb.delete(0,3);  //output:- l kumar saini
sb.deleteCharAt(2);  // output:- Atl kumar saini
try{
    sb.delete(-1,40);    
}
catch (Exception e){
    System.out.println("what is the error:- "+e);   //output:- what is the error:- java.lang.StringIndexOutOfBoundsException: start -1, end 16, length 16
}

//convertinf from stringbuilder to string again
String ans = new String(sb);
