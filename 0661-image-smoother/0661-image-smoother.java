/*class Solution {
    int fun(int [][]mat,int tr,int tc,int wr,int wc){
        int cr,cc;
        int c=1;
        int sum=mat[wr][wc];
        cr=wr-1;
        cc=wc;
        if (cr>=0){//top
            sum=sum+mat[cr][cc];
            c++;
        }
        cr=wr-1;
        cc=wc+1;
        if (cr>=0 && cc<tc)//rtop
         {  sum=sum+mat[cr][cc];
            c++;
         }
        cr=wr;
        cc=wc+1;
        if (cc>=0  && cc<tc)//right
            sum=sum+mat[cr][cc]
        cr=wr+1;
        cc=wc+1;
        if (cr>tr && cc<ct)//rb
            sum=sum+mat[cr][cc]
        
        cr=wr+1;
        cc=wc;
        if (cr<tr)//br
            sum=sum+mat[cr][cc]
        cr=wr+1;
        cc=wc-1;
        if (cc>=0 && cr>=0)
            sum=sum+mat[cr][cc]
    }
    return sum/c;
    }
    public int[][] imageSmoother(int[][] img) {
        int tr=mat.length;
        int tc=mat[0].length;
        int[][] res=new int[tr][tc]
        int r,c;
        for(r=0;r<tr;r++){
            for(c=0;c<tc;c++){
                res[r][c]=fun(mat,tr,tc,r,c)

    }
}*/
class Solution {

    int fun(int [][]mat, int tr, int tc, int wr, int wc) {

        int cr, cc;
        int c = 1;
        int sum = mat[wr][wc];

        // top
        cr = wr - 1;
        cc = wc;
        if (cr >= 0) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // top-right
        cr = wr - 1;
        cc = wc + 1;
        if (cr >= 0 && cc < tc) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // right
        cr = wr;
        cc = wc + 1;
        if (cc < tc) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // bottom-right
        cr = wr + 1;
        cc = wc + 1;
        if (cr < tr && cc < tc) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // bottom
        cr = wr + 1;
        cc = wc;
        if (cr < tr) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // bottom-left
        cr = wr + 1;
        cc = wc - 1;
        if (cr < tr && cc >= 0) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // left
        cr = wr;
        cc = wc - 1;
        if (cc >= 0) {
            sum = sum + mat[cr][cc];
            c++;
        }

        // top-left
        cr = wr - 1;
        cc = wc - 1;
        if (cr >= 0 && cc >= 0) {
            sum = sum + mat[cr][cc];
            c++;
        }

        return sum / c;
    }


    public int[][] imageSmoother(int[][] img) {

        int tr = img.length;
        int tc = img[0].length;

        int[][] res = new int[tr][tc];

        int r, c;

        for (r = 0; r < tr; r++) {
            for (c = 0; c < tc; c++) {

                res[r][c] = fun(img, tr, tc, r, c);
            }
        }

        return res;
    }
}