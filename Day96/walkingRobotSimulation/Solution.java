class Robot {
    int idx=0;
    List<int[]> list=new ArrayList<>();
    boolean move=false;

    public Robot(int width, int height) {
        for (int x = 0; x < width; x++) {
            list.add(new int[]{x, 0, 0});
        }

        // Right column (bottom to top) - North (1)
        for (int y = 1; y < height; y++) {
            list.add(new int[]{width - 1, y, 1});
        }

        // Top row (right to left) - West (2)
        for (int x = width - 2; x >= 0; x--) {
            list.add(new int[]{x, height - 1, 2});
        }

        // Left column (top to bottom) - South (3)
        for (int y = height - 2; y > 0; y--) {
            list.add(new int[]{0, y, 3});
        }

        // Handle corner case for (0,0) after movement
        list.get(0)[2] = 3;
    }
    
    public void step(int num) {
        move=true;
        idx=(idx+num)%list.size();
    }
    
    public int[] getPos() {
        return new int[]{list.get(idx)[0],list.get(idx)[1]};
    }
    
    public String getDir() {
        if(move==false){
            return "East";
        }else{
            int dir=list.get(idx)[2];
            if(dir==0) return "East";
            else if(dir==1) return "North";
            else if(dir==2) return "West";
            else return "South";
        }
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */