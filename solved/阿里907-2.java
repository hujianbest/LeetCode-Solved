import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    	
        // //系统繁忙，请稍后再试...就很尴尬了
        // System.out.println("yes"+","+0);
        //     return;
        
        Scanner in = new Scanner(System.in);

        List<Node> list = new ArrayList<>();
        Node root = null;

            String line1 = in.nextLine();
            String[] strs1 = line1.split(",");
            root = new Node(Integer.parseInt(strs1[0]),Integer.parseInt(strs1[1]));
            String line2 = in.nextLine();
            String[] strs2= line2.split(",");
            int i =0;
            while(i<strs2.length){
                list.add(new Node(Integer.parseInt(strs2[i++]),Integer.parseInt(strs2[i++])));
            }


        if(isContains(list, root)){
            System.out.println("yes"+","+0);
            return;
        }

        Node a=null;
        Node b=null;
        double min1=Double.MAX_VALUE;
        double min2=Double.MAX_VALUE;

        for(Node node : list){
            double dis = dis2(root, node);
            if(dis<min1){
                min1=dis;
                a = node;
            }else if(dis<min2){
                min2 = dis;
                b = node;
            }
        }

        double minDis = dis3(root, a, b);
        System.out.println("no"+","+(int)Math.round(minDis));



    }
    
    public static double dis2(Node a, Node b) {
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }

    public static double dis3(Node root, Node a, Node b) {
        double space = 0;
        double o,p,q;
        o = dis2(a, b);
        p = dis2(a, root);
        q = dis2(b, root);

        double opq = (o+p+q)/2;
        double s = Math.sqrt(opq*(opq-o)*(opq-p)*(opq-q));
        space = 2*s/o;

        return space;

    }

    public static boolean isContains(List<Node> list, Node root) {
        boolean c = false;
        for (int i = 0, j = list.size()-1; i < list.size(); j = i++){
            if((list.get(i).y>root.y)!=(list.get(j).y>root.y)&&
            (root.x<(list.get(j).x-list.get(i).x)*(root.y-list.get(i).y)/
            (list.get(j).y-list.get(i).y)+list.get(i).x)){
                c=!c;
            }
        }
        return c;
    }

}


class Node{
    int x;
    int y;

    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}