package de.erichseifert.gral.graphics;

import de.erichseifert.gral.util.Orientation;

public abstract class AbstractOrientedLayout extends AbstractLayout implements
		OrientedLayout {
	/** Orientation in which elements should be laid out. */
	private Orientation orientation;

	public AbstractOrientedLayout(Orientation orientation, double gapX, double gapY) {
		super(gapX, gapY);
		this.orientation = orientation;
	}

	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	@Override
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
}