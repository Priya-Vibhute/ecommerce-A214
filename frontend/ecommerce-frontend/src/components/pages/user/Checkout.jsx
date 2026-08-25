import { Link } from "react-router-dom";

function Checkout() {
  return (
    <div className="checkout-page">

      <div className="container py-5">

        {/* ================= HEADER ================= */}

        <div className="checkout-header mb-5">

          <span className="checkout-subtitle">
            CHECKOUT
          </span>

          <h1>
            Complete Your Order
          </h1>

          <p>
            Enter your details and choose your preferred payment method.
          </p>

        </div>


        <div className="row g-4">

          {/* ================= LEFT SECTION ================= */}

          <div className="col-lg-8">

            {/* CUSTOMER INFORMATION */}

            <div className="checkout-card mb-4">

              <div className="checkout-card-header">

                <div className="step-number">
                  1
                </div>

                <div>
                  <h4>
                    Customer Information
                  </h4>

                  <p>
                    Enter your contact details
                  </p>
                </div>

              </div>


              <div className="row g-3">

                <div className="col-md-6">

                  <label>
                    First Name
                  </label>

                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter first name"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    Last Name
                  </label>

                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter last name"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    Email Address
                  </label>

                  <input
                    type="email"
                    className="form-control"
                    placeholder="you@example.com"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    Phone Number
                  </label>

                  <input
                    type="tel"
                    className="form-control"
                    placeholder="+1 234 567 8900"
                  />

                </div>

              </div>

            </div>


            {/* SHIPPING ADDRESS */}

            <div className="checkout-card mb-4">

              <div className="checkout-card-header">

                <div className="step-number">
                  2
                </div>

                <div>
                  <h4>
                    Shipping Address
                  </h4>

                  <p>
                    Where should we deliver your order?
                  </p>
                </div>

              </div>


              <div className="row g-3">

                <div className="col-12">

                  <label>
                    Address
                  </label>

                  <input
                    type="text"
                    className="form-control"
                    placeholder="House number, street name"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    City
                  </label>

                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter city"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    State
                  </label>

                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter state"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    ZIP Code
                  </label>

                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter ZIP code"
                  />

                </div>


                <div className="col-md-6">

                  <label>
                    Country
                  </label>

                  <select className="form-select">

                    <option>
                      Select Country
                    </option>

                    <option>
                      United States
                    </option>

                    <option>
                      Canada
                    </option>

                    <option>
                      United Kingdom
                    </option>

                    <option>
                      India
                    </option>

                  </select>

                </div>

              </div>

            </div>


           

          </div>


          {/* ================= RIGHT SECTION ================= */}

          <div className="col-lg-4">

            <div className="checkout-summary">

              <h4>
                Order Summary
              </h4>


              {/* Product */}

              <div className="checkout-product">

                <img
                  src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=200"
                  alt="Wireless Headphones"
                />

                <div>

                  <h6>
                    Wireless Headphones
                  </h6>

                  <span>
                    Qty: 1
                  </span>

                </div>

                <strong>
                  $59.99
                </strong>

              </div>


              <hr />


              {/* Price Details */}

              <div className="checkout-summary-row">

                <span>
                  Subtotal
                </span>

                <span>
                  $59.99
                </span>

              </div>


              <div className="checkout-summary-row">

                <span>
                  Shipping
                </span>

                <span className="free">
                  FREE
                </span>

              </div>


              <div className="checkout-summary-row">

                <span>
                  Tax
                </span>

                <span>
                  $0.00
                </span>

              </div>


              <hr />


              <div className="checkout-total">

                <span>
                  Total
                </span>

                <strong>
                  $59.99
                </strong>

              </div>


              {/* Place Order */}

              <button className="place-order-btn">

                🔒 Place Order

              </button>


              <p className="checkout-security">

                Your payment information is encrypted
                and securely processed.

              </p>


              <Link
                to="/cart"
                className="back-to-cart"
              >
                ← Back to Cart
              </Link>

            </div>

          </div>

        </div>

      </div>

    </div>
  );
}

export default Checkout;