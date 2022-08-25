import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 220527 자료구조(강교수님)
class Solution {
    private class Pos {
        int row, col;
        Pos() {row = 0; col = 0;}
        Pos(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // bfs를 한 다음에 몇 개의 픽셀이 연결되었는지 리턴 할 것임
    int bfs(Pos start, int m, int n, int[][] picture, int[][] visit, int color) {
        int n_connect = 0;

        // 스타트 좌표를 queue에 넣는다.
        Queue<Pos> q = new LinkedList<>();
        q.add(start);

        // 상, 하, 좌, 우 순서로 볼 것
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        while (q.isEmpty() == false) {
            // queue에서 하나 뺀다.
            Pos curPos = q.poll();

            // 이미 본 것은 pass
            if(visit[curPos.row][curPos.col] != 0) continue;

            // 처음 본것은 방문처리
            visit[curPos.row][curPos.col] = color;
            ++n_connect;

            // 연결된 것을 queue에 넣는다
            // 연결이란? picture의 pixel 값이 같은것
            for(int i = 0; i < dx.length; ++i) {
                int row = curPos.row + dy[i];
                int col = curPos.col + dx[i];

                // 예외처리
                if(row < 0 || col < 0 || row >= m || col >= n) continue;

                if(picture[row][col] == color && visit[row][col] == 0) {
                    q.add(new Pos(row, col));
                }
            }

        }

        return n_connect;
    }

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[][] visit = new int[m][n];
        int area = 0;

        for(int row = 0; row < m; ++row) {
            for(int col = 0; col < n; ++col) {
                if(picture[row][col] != 0 && visit[row][col] == 0) {
                    area = bfs(new Pos(row, col), m, n, picture, visit, picture[row][col]);
                    // 가장큰면적 갱신
                    if(area>maxSizeOfOneArea) maxSizeOfOneArea = area;
                    // 덩어리 갯수 추가
                    ++numberOfArea;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}

public class Project_220527 {
    public static void main(String[] args) {
        Solution bfs = new Solution();
        int m = 13;
        int n = 16;
        int[][] picture = {
                {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},
                {0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},
                {0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},
                {0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}
        };
        System.out.println(Arrays.toString(bfs.solution(m, n, picture)));
    }
}
