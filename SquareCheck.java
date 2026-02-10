class SquareCheck {

    static int dist(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return dx * dx + dy * dy;
    }

    static boolean isSquare(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {

        int[] d = new int[6];
        d[0] = dist(x1,y1,x2,y2);
        d[1] = dist(x1,y1,x3,y3);
        d[2] = dist(x1,y1,x4,y4);
        d[3] = dist(x2,y2,x3,y3);
        d[4] = dist(x2,y2,x4,y4);
        d[5] = dist(x3,y3,x4,y4);

        int min = d[0], max = d[0];
        for (int i = 1; i < 6; i++) {
            if (d[i] < min) min = d[i];
            if (d[i] > max) max = d[i];
        }

        if (min == 0) return false;

        int side = 0, diag = 0;
        for (int i = 0; i < 6; i++) {
            if (d[i] == min) side++;
            else if (d[i] == max) diag++;
            else return false;
        }

        return side == 4 && diag == 2;
    }

    public static void main(String[] args) {
        System.out.println(
            isSquare(20,10, 10,20, 20,20, 10,10) ? "Yes" : "No"
        );
    }
}
