/**
 * 
 */
package com.infogen.authc.configuration.handle.url_pattern;

/**
 * 
 * @author larry/larrylv@outlook.com/创建时间 2015年5月4日 下午2:11:06
 * @since 1.0
 * @version 1.0
 */
public class UrlPattern_Start extends UrlPattern {

	/* (non-Javadoc)
	 * @see com.infogen.authc.configuration.comparison.Comparison#has(java.lang.String)
	 */
	@Override
	public Boolean has(String requestURI) {
		return requestURI.startsWith(uri);
	}

}
