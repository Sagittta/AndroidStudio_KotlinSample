package kr.hs.emirim.Sagittta.kotlinsample;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {

    //binding
    private static Context applicationContext;      //변수 생성

    //applicationContext 전역 제공하는 메소드
    public static Context getAppContext() {
        return applicationContext;                  //applicationContext에 접근가능하게 하는 getAppContext() 메소드 생성.
    }



    //앱이 최초 실행될 때 호출
    @Override           //어노테이션. 각주(부가 설명, 컴파일러를 위한 것). 잘못 썼을 때 알려주기 위함. 주석(comment, 사람을 위한 것, 컴파일 시 지워짐.)과 비슷한 것.
    public void onCreate() {            //Activity에 있던 함수.
        super.onCreate();

        applicationContext = getApplicationContext();
    }
}
