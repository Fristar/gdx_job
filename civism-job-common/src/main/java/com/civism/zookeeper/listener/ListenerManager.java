package com.civism.zookeeper.listener;

import org.apache.zookeeper.Watcher;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author star
 * @date 2018/8/3 下午2:05
 */
public class ListenerManager {

    /**
     * 监听器
     */
    private Listener listener;
    private Map<String, Boolean> childNode = new ConcurrentHashMap<String, Boolean>(32);
    /**
     * 节点数据
     */
    private byte[] data;
    /**
     * 事件类型
     */
    private Watcher.Event.EventType eventType;
    /**
     * 是否监听孩子节点数据的变化
     */
    private boolean childDataChange;
    /**
     * 是否监听孩子节点的变化
     */
    private boolean childChange;


    public ListenerManager(Listener listener) {
        this.listener = listener;
    }

    public ListenerManager(Listener listener, boolean childDataChange, boolean childChange) {
        this.listener = listener;
        this.childDataChange = childDataChange;
        this.childChange = childChange;
    }

    public Listener getListener() {
        return listener;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public Map<String, Boolean> getChildNode() {
        return childNode;
    }

    public void setChildNode(Map<String, Boolean> childNode) {
        this.childNode = childNode;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Watcher.Event.EventType getEventType() {
        return eventType;
    }

    public void setEventType(Watcher.Event.EventType eventType) {
        this.eventType = eventType;
    }

    public boolean isChildDataChange() {
        return childDataChange;
    }

    public void setChildDataChange(boolean childDataChange) {
        this.childDataChange = childDataChange;
    }

    public boolean isChildChange() {
        return childChange;
    }

    public void setChildChange(boolean childChange) {
        this.childChange = childChange;
    }
}
