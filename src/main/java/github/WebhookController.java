package github;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

@Controller("/github/webhook")
public class WebhookController {

    private static final Logger LOG = LoggerFactory.getLogger(WebhookController.class);

    @Post
    public HttpResponse<String> webhook(@Body HashMap request) {
        // validate request.config.secret == "very_secure"

        /repos/:owner/:repo/branches/:branch/protection
        LOG.info(request);
        Collections.unmodifiableList()
        return HttpResponse.ok();
    }
}

//{
//        "required_status_checks": {
//        "strict": true,
//        "contexts": [
//        "continuous-integration/travis-ci"
//        ]
//        },
//        "enforce_admins": true,
//        "required_pull_request_reviews": {
//        "dismissal_restrictions": {
//        "users": [
//        "octocat"
//        ],
//        "teams": [
//        "justice-league"
//        ]
//        },
//        "dismiss_stale_reviews": true,
//        "require_code_owner_reviews": true,
//        "required_approving_review_count": 2
//        },
//        "restrictions": {
//        "users": [
//        "octocat"
//        ],
//        "teams": [
//        "justice-league"
//        ],
//        "apps": [
//        "super-ci"
//        ]
//        },
//        "required_linear_history": true,
//        "allow_force_pushes": true,
//        "allow_deletions": true
//        }