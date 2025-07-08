public class DashEnemy extends Enemy {
    private double dashCooldown = 0;
    private boolean isDashing = false;
    private double targetX, targetY;

    public DashEnemy(double x, double y, double vx, double vy) {
        super(x, y, vx, vy);
        life = 3; // 少し弱めに設定
    }

    @Override
    public void move() {
        dashCooldown += 0.03;

        if (!isDashing && dashCooldown > 2.0) {
            // プレイヤーの位置を狙って突進開始
            targetX = GameWorld.player.x;
            targetY = GameWorld.player.y;
            isDashing = true;
            dashCooldown = 0;
        }

        if (isDashing) {
            double dx = targetX - x;
            double dy = targetY - y;
            double dist = Math.sqrt(dx * dx + dy * dy);
            if (dist > 1) {
                x += (dx / dist) * 10; // 高速移動
                y += (dy / dist) * 10;
            } else {
                isDashing = false; // 到達したら停止
            }
        } else {
            y += 1; // 通常移動
        }
    }

    @Override
    public void draw(MyFrame f) {
        f.setColor(255, 0, 0); // 赤色でスピード感を演出
        f.fillRect(x + 10, y, 14, 15);
        f.setColor(255, 0, 0);
        f.fillRect(x + 12, y + 15, 10, 15);
    }
}
