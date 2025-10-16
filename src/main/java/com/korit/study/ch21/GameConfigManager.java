package com.korit.study.ch21;

import java.util.Objects;

public class GameConfigManager {

    private int soundVolume;    // 초기화 안함 왜냐면 밑에서 할거라서
    private String resolution;
    private static GameConfigManager instance;

    private GameConfigManager(int soundVolume, String resolution) {
        this.soundVolume = soundVolume;
        this.resolution = resolution;
    }

    public static GameConfigManager getInstance() {
        if (Objects.isNull(instance)) { // instance가 아직 생성된 적 없는지 확인
            synchronized (GameConfigManager.class) { // 한번에 하나의 스레드만 들어올 수 있도록 하는 코드
                if (Objects.isNull(instance)) { // 이후 다른 스레드가 이미 객체를 생성했는지 한번 더 확인
                    instance = new GameConfigManager(50, "1280x720");   // 객체 생성 및 기본값 설정
                }
            }
        }
        return instance;
    }

    public void setSoundVolume(int volume) { // 볼륨 설정
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() { //볼륨 출력
        return soundVolume;
    }

    public void setResolution(String resolution) { //해상도 세팅
        this.resolution = resolution;
    }

    public String getResolution() { // 해상도 출력
        return resolution;
    }

    public String getConfigInfo() { // toString
        return String.format("Sound: %d, Resolution: %s", soundVolume, resolution);
    }
}
