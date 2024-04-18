/** @Author Shanto2005 */
public class Shooting extends Component {
    public SpatialObject cam;
    public Text3D t1;
    public Text3D t2;
    public Text3D t3;
    public Text3D t4;
    public Text3D t5;
    public SpatialObject E1;
    public SpatialObject E2;
    public SpatialObject E3;
    public SpatialObject E4;
    public SpatialObject E5;
    private int [] H = new int[5];
    public SUIButton Shoot;
    
   private String oName;
    
  /// Run only once
  @Override
  public void start() {
      H[0] = 100;
      H[1] = 100;
      H[2] = 100;
      H[3] = 100;
      H[4] = 100;
  }

  /// Repeat every frame
  @Override
  public void repeat() {
    LaserHit lh = new Laser().trace(cam.getTransform().getGlobalPosition(), cam.getTransform().forward(), 50);
 //   N.setText(lh.getObject().getName()+lh.getDistance());
try{ oName = lh.getObject().getName();}catch(Exception e) {}
 
 try{   if(oName == E1.getName()) {
     if(Shoot.isPressed()) {
         E1.findChildObject("Text").setEnabled(true);
         H[0] -= 10;
     } else{
         E1.findChildObject("Text").setEnabled(false);
     }
 } else if(oName == E2.getName()) {
     if(Shoot.isPressed()) {
         E2.findChildObject("Text").setEnabled(true);
         H[1] -= 10;
     } else{
         E2.findChildObject("Text").setEnabled(false);
     }
 } else if(oName == E3.getName()) {
     if(Shoot.isPressed()) {
         E3.findChildObject("Text").setEnabled(true);
         H[2] -= 10;
     } else{
         E3.findChildObject("Text").setEnabled(false);
     }
 } else if(oName == E4.getName()) {
     if(Shoot.isPressed()) {
         E4.findChildObject("Text").setEnabled(true);
         H[3] -= 10;
     } else{
         E4.findChildObject("Text").setEnabled(false);
     }
 } else if(oName == E5.getName()) {
     if(Shoot.isPressed()) {
         E5.findChildObject("Text").setEnabled(true);
         H[4] -= 10;
     } else{
         E5.findChildObject("Text").setEnabled(false);
     }
 }
 
 
 
 
 
 } catch(Exception e) {}
 
 if(H[0] == 0) {
     E1.setEnabled(false);
     H[0] = 100;
 } if(H[1] == 0) {
     E2.setEnabled(false);
     H[1] = 100;
 } if(H[2] == 0) {
     E3.setEnabled(false);
     H[2] = 100;
 } 
 if(H[3] == 0) {
     E4.setEnabled(false);
     H[3] = 100;
 } if(H[4] == 0) {
     E5.setEnabled(false);
     H[4] = 100;
 }
 
 
 t1.setText(""+H[0]);
 t2.setText(""+H[1]);
 t3.setText(""+H[2]);
 t4.setText(""+H[3]);
 t5.setText(""+H[4]);
 
 
  }
  
} 
