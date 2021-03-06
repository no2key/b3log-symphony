<div style="position:relative">
    <img class="avatar-big" title="${user.userName}" src="${user.userThumbnailURL}" />
    <img class="user-online" title="<#if user.userOnlineFlag>${onlineLabel}<#else>${offlineLabel}</#if>" src="/images/<#if user.userOnlineFlag>on<#else>off</#if>line.png" />
    <div>
        <div class="user-name">
            <a href="/member/${user.userName}">${user.userName}</a><br/>
            <#if isLoggedIn && (userName != user.userName)>
            <#if isFollowing>
            <button class="red" onclick="Util.unfollow(this, '${followingId}')"> 
                ${unfollowLabel}
            </button>
            <#else>
            <button class="green" onclick="Util.follow(this, '${followingId}')"> 
                ${followLabel}
            </button>
            </#if>
            </#if>
        </div>
        <#if user.userIntro!="">
        <div>
            ${user.userIntro}
        </div>
        </#if>
        <div class="user-info">
            <span class="ft-small">Symphony</span>
            ${user.userNo}
            <span class="ft-small">${noVIPLabel}</span>
        </div>
        <#if user.userURL!="">
        <div class="user-info">
            <span class="ft-small">URL</span>
            <a target="_blank" rel="friend" href="${user.userURL?html}">${user.userURL?html}</a>
        </div>
        </#if>
        <div class="user-info">
            <span class="ft-small">${joinTimeLabel}</span> ${user.userCreateTime?string('yyyy-MM-dd HH:mm:ss')}
        </div>

        <ul class="status fn-clear">
            <li>
                <strong>${user.userTagCount}</strong>
                <span class="ft-small">${tagLabel}</span>
            </li>
            <li>
                <strong>${user.userArticleCount}</strong>
                <span class="ft-small">${articleLabel}</span>
            </li>
            <li>
                <strong>${user.userCommentCount}</strong>
                <span class="ft-small">${cmtLabel}</span>
            </li>
        </ul>
    </div>
</div>