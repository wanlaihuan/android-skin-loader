package cn.feng.skin.manager.listener;

import cn.feng.skin.manager.loader.SkinInflaterFactory;

public interface ISkinLoader {
	void attach(SkinInflaterFactory observer);
	void detach(SkinInflaterFactory observer);
	void notifySkinUpdate();
}
