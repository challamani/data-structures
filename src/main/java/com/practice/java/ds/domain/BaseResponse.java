package com.practice.java.ds.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BaseResponse implements Serializable {

    private String status;
    private List<String> messages;
    private String timeComplexity;
    private String spaceComplexity;
    private List<String> metadata;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String getTimeComplexity() {
        return timeComplexity;
    }

    public void setTimeComplexity(String timeComplexity) {
        this.timeComplexity = timeComplexity;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }

    public void setSpaceComplexity(String spaceComplexity) {
        this.spaceComplexity = spaceComplexity;
    }

    public List<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "status='" + status + '\'' +
                ", messages=" + messages +
                ", timeComplexity='" + timeComplexity + '\'' +
                ", spaceComplexity='" + spaceComplexity + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}
