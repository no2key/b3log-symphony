/*
 * Copyright (c) 2012-2015, b3log.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.symphony.model;

/**
 * This class defines option model relevant keys.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.2, Nov 23, 2012
 * @since 0.2.0
 */
public final class Option {

    /**
     * Option.
     */
    public static final String OPTION = "option";
    /**
     * Options.
     */
    public static final String OPTIONS = "options";
    /**
     * Key of option value.
     */
    public static final String OPTION_VALUE = "optionValue";
    /**
     * Key of option category.
     */
    public static final String OPTION_CATEGORY = "optionCategory";
    // oId constants
    /**
     * Key of member count.
     */
    public static final String ID_C_STATISTIC_MEMBER_COUNT = "statisticMemberCount";
    /**
     * Key of article count.
     */
    public static final String ID_C_STATISTIC_ARTICLE_COUNT = "statisticArticleCount";
    /**
     * Key of tag count.
     */
    public static final String ID_C_STATISTIC_TAG_COUNT = "statisticTagCount";
    /**
     * Key of comment count.
     */
    public static final String ID_C_STATISTIC_CMT_COUNT = "statisticCmtCount";
    /**
     * Key of max online visitor count.
     */
    public static final String ID_C_STATISTIC_MAX_ONLINE_VISITOR_COUNT = "statisticMaxOnlineVisitorCount";
    // Category constants
    /**
     * Statistic.
     */
    public static final String CATEGORY_C_STATISTIC = "statistic";

    /**
     * Private constructor.
     */
    private Option() {
    }
}
