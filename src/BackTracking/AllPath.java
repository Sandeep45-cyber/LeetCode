package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPath {

    static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length];

     allPathPrints("", maze, 0, 0, path, 1);

    }

    static ArrayList<String> allPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length -1  && c == maze[0].length - 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c])
            return list;

        maze[r][c] = false;

        if(r < maze.length - 1){
            list.addAll(allPath(p + 'D', maze,r +1, c));
        }

        if( c < maze[0].length - 1){
            list.addAll(allPath(p + 'R',maze,  r, c + 1));
        }

        if(r > 0){
            list.addAll(allPath(p + 'U', maze, r -1, c));
        }

        if(c > 0){
            list.addAll(allPath(p + 'L', maze, r, c - 1));
        }

        maze[r][c] = true;

        return list;
    }


    static ArrayList<String> allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length -1  && c == maze[0].length - 1){
            path[r][c] = step;
            ArrayList<String> ans = new ArrayList<>();
            for(int[] arr: path){
                ans.add(Arrays.toString(arr));

            }
            ans.add(p);
            System.out.println();
            return ans;
        }


        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c])
            return list;

        maze[r][c] = false;

        path[r][c] = step;

        if(r < maze.length - 1){
            list.addAll(allPathPrint(p + 'D', maze,r +1, c, path, step + 1));
        }

        if( c < maze[0].length - 1){
            list.addAll(allPathPrint(p + 'R',maze,  r, c + 1, path, step + 1));
        }

        if(r > 0){
            list.addAll(allPathPrint(p + 'U', maze, r -1, c, path, step + 1));
        }

        if(c > 0){
            list.addAll(allPathPrint(p + 'L', maze, r, c - 1, path, step + 1));
        }

        maze[r][c] = true;
        path[r][c] = 0;

        return list;
    }


    static void allPathPrints(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length -1  && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
        }

        if(!maze[r][c])
            return;

        maze[r][c] = false;

        path[r][c] = step;

        if(r < maze.length - 1){
            allPathPrints(p + 'D', maze,r +1, c, path, step + 1);
        }

        if( c < maze[0].length - 1){
            allPathPrints(p + 'R',maze,  r, c + 1, path, step + 1);
        }

        if(r > 0){
            allPathPrints(p + 'U', maze, r -1, c, path, step + 1);
        }

        if(c > 0){
            allPathPrints(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
