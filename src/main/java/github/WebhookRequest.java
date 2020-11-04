package github;

public class WebhookRequest {
    private Hook hook;

    public Hook getHook() {
        return hook;
    }

    public WebhookRequest setHook(Hook hook) {
        this.hook = hook;
        return this;
    }
}

class Hook {
    private Config config;

    public Config getConfig() {
        return config;
    }

    public Hook setConfig(Config config) {
        this.config = config;
        return this;
    }
}

class Config {
    private String secret;

    public String getSecret() {
        return secret;
    }

    public Config setSecret(String secret) {
        this.secret = secret;
        return this;
    }
}