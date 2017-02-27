public class Three{
    public static String removeTags(String html){
        if(html.length() < 1) return "";
        if(html.substring(0,1).equals("<")) return removeTags(html.substring(html.indexOf(">")+1));
        return html.substring(0,1) + removeTags(html.substring(1));
    }
}
