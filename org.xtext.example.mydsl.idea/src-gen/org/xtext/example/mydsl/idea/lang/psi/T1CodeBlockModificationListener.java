/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.idea.lang.psi;

import com.intellij.psi.util.PsiModificationTracker;
import org.eclipse.xtext.psi.BaseXtextCodeBlockModificationListener;
import org.xtext.example.mydsl.idea.lang.T1Language;

public class T1CodeBlockModificationListener extends BaseXtextCodeBlockModificationListener {

	public T1CodeBlockModificationListener(PsiModificationTracker psiModificationTracker) {
		super(T1Language.INSTANCE, psiModificationTracker);
	}

}
