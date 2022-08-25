import java.util.*;

class Position {
    int row;
    int col;

    Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class Project_220511 {
    static int dfs(int startRow, int startCol, int[][] input, int[][] visit, int n_group) {
        Stack<Position>stack = new Stack<>();
        Position start = new Position(startRow, startCol);
        stack.push(start);

        int housenum = 0;

        while (stack.empty() == false) {
            // 스택에서 하나 꺼내고
            Position curpos = stack.pop();
            int row = curpos.row;
            int col = curpos.col;
            // 단지마다 집 개수를 세기 위해서 (if문: 스택에 중복으로 쌓인거 전부 세는거 방지)
            if (visit[row][col] == 0) housenum++;

            // 방문 처리 하고
            visit[row][col] = n_group;

            // 연결된 노드가 있으면 넣는다.
            // 상: row-1, col
            if (row-1 >= 0) {
                if (input[row-1][col] == 1 && visit[row-1][col] == 0) {
                    stack.push(new Position(row-1, col));
                }
            }
            // 하: row+1, col
            if (row+1 < input.length) {
                if (input[row+1][col] == 1 && visit[row+1][col] == 0) {
                    stack.push(new Position(row+1, col));
                }
            }
            // 좌: row, col-1
            if (col-1 >= 0) {
                if (input[row][col-1] == 1 && visit[row][col-1] == 0) {
                    stack.push(new Position(row, col-1));
                }
            }
            // 우: row, col+1
            if (col+1 < input.length) {
                if (input[row][col+1] == 1 && visit[row][col+1] == 0) {
                    stack.push(new Position(row, col+1));
                }
            }

        }

        return housenum;
    }

    public static void main(String[] args) {

        int mapSize = 7;
        int [][] input = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        int [][] visit = new int[mapSize][mapSize];
        int n_group = 0;
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < mapSize; ++i) {
            for (int j = 0; j < mapSize; ++j) {
                if (input[i][j] == 1 && visit[i][j] == 0) {
                    int num = dfs(i, j, input, visit, ++n_group);
                    list.add(num);
                    System.out.println(n_group + "단지의 집 개수는 " + num);
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        list.add(0, n_group);


//        System.out.println(Arrays.deepToString(visit));
        for (int i = 0; i < mapSize; ++i) {
            System.out.println(Arrays.toString(visit[i]));
        }

        System.out.println(list);
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }

    }
}
