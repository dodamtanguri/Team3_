package kr.or.bit.shoppingMall.Action;

public class ActionForward {
    private boolean isRedirect = false; //화면 아니면 로직 제어
    private String path=null; //이동경로 (뷰의 주소)

    public boolean isRedirect() {
        return isRedirect;
    }
    public void setRedirect(boolean isRedirect) {
        this.isRedirect = isRedirect;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
}
