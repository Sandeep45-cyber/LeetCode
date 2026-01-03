package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {

    static void main(String[] args) {
        System.out.println(maze(3, 3));
//        path("", 3, 3);

//        ArrayList<String> ans = pathRet("", 3, 3);
//        System.out.println(ans);

//        System.out.println(pathRetDiagonal("", 3, 3));
//        boolean[][] maze = new boolean[][]{
//                {true, true, true},
//                {true, false, true},
//                {true, true, true}
//        };
//
//        System.out.println(pathRetDiagonalObs("", maze, 0, 0));
    }

    static int maze(int r, int c){
        if(r == 1 || c == 1)
            return 1;


        int left = maze(r -1, c);
        int right = maze(r, c- 1);

        return left + right;

    }


    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }



        if( r > 1){
            path(p + "D", r - 1, c);
        }

        if( c > 1){
            path(p + "R", r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if( r > 1){
            list.addAll(pathRet(p + "D", r - 1, c));
        }

        if( c > 1){
            list.addAll(pathRet(p + "R", r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p + "D", r -1, c - 1));
        }

        if( r > 1){
            list.addAll(pathRetDiagonal(p + "V", r - 1, c));
        }

        if( c > 1){
            list.addAll(pathRetDiagonal(p + "H", r, c - 1));
        }

        return list;
    }



    static ArrayList<String> pathRetDiagonalObs(String p, boolean[][] maze, int r, int c){
        if(r == maze.length -1  && c == maze[0].length - 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c])
            return list;

        if(r < maze.length - 1){
            list.addAll(pathRetDiagonalObs(p + 'D', maze,r +1, c));
        }

        if( c < maze[0].length - 1){
            list.addAll(pathRetDiagonalObs(p + 'R',maze,  r, c + 1));
        }

        return list;
    }
}
